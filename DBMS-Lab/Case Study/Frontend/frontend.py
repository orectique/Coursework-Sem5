import streamlit as st

st.set_page_config(
    page_title= 'Gambit',
    page_icon = '♟️',
    layout= 'centered'
)

st.title("Gambit - A Chess Olympiad Reporting System")
stratum = st.selectbox(
    'Select Reporting Stratum',
    ('Tournament', 'Match', 'Player')
)
body = st.container()

if stratum == 'Tournament':
    with body:
        st.header("Tournament Stratum")
        st.